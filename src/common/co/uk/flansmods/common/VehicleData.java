package co.uk.flansmods.common;

import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;

public class VehicleData extends DriveableData
{
	public VehicleData(String s)
	{
		super(s, 2, 0, 0);
	}
	
    public VehicleData(String s, VehicleType vehicleType)
    {
        super(s, vehicleType.shortName, 2, vehicleType.numBombSlots, vehicleType.numCargoSlots);
    }
	
	public VehicleType getVehicleType()
	{
		return VehicleType.getVehicle(type);
	}
}