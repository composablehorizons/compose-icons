package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DropdownMenu: ImageVector
    get() {
        if (_DropdownMenu != null) return _DropdownMenu!!
        
        _DropdownMenu = ImageVector.Builder(
            name = "dropdown-menu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5811f, 11.1087f)
                curveTo(14.763f, 11.1463f, 14.9004f, 11.3073f, 14.9004f, 11.5004f)
                curveTo(14.9002f, 11.6933f, 14.763f, 11.8545f, 14.5811f, 11.892f)
                lineTo(14.5f, 11.9007f)
                horizontalLineTo(7.5f)
                curveTo(7.27921f, 11.9007f, 7.09981f, 11.7211f, 7.09961f, 11.5004f)
                curveTo(7.09961f, 11.2794f, 7.27909f, 11.1f, 7.5f, 11.1f)
                horizontalLineTo(14.5f)
                lineTo(14.5811f, 11.1087f)
                close()
                moveTo(14.5811f, 9.10875f)
                curveTo(14.763f, 9.14627f, 14.9004f, 9.30725f, 14.9004f, 9.50035f)
                curveTo(14.9002f, 9.69332f, 14.763f, 9.85449f, 14.5811f, 9.89195f)
                lineTo(14.5f, 9.90074f)
                horizontalLineTo(7.5f)
                curveTo(7.27921f, 9.90074f, 7.09981f, 9.72109f, 7.09961f, 9.50035f)
                curveTo(7.09961f, 9.27944f, 7.27909f, 9.09996f, 7.5f, 9.09996f)
                horizontalLineTo(14.5f)
                lineTo(14.5811f, 9.10875f)
                close()
                moveTo(2.5f, 9.25035f)
                lineTo(0f, 6.00035f)
                horizontalLineTo(5f)
                lineTo(2.5f, 9.25035f)
                close()
                moveTo(14.5811f, 7.10875f)
                curveTo(14.7631f, 7.14626f, 14.9004f, 7.30725f, 14.9004f, 7.50035f)
                curveTo(14.9002f, 7.69332f, 14.763f, 7.85449f, 14.5811f, 7.89195f)
                lineTo(14.5f, 7.90074f)
                horizontalLineTo(7.5f)
                curveTo(7.27921f, 7.90074f, 7.09981f, 7.72109f, 7.09961f, 7.50035f)
                curveTo(7.09961f, 7.27944f, 7.27909f, 7.09996f, 7.5f, 7.09996f)
                horizontalLineTo(14.5f)
                lineTo(14.5811f, 7.10875f)
                close()
                moveTo(14.5811f, 5.10875f)
                curveTo(14.763f, 5.14627f, 14.9004f, 5.30725f, 14.9004f, 5.50035f)
                curveTo(14.9002f, 5.69332f, 14.763f, 5.85449f, 14.5811f, 5.89195f)
                lineTo(14.5f, 5.90074f)
                horizontalLineTo(7.5f)
                curveTo(7.27921f, 5.90074f, 7.09981f, 5.72109f, 7.09961f, 5.50035f)
                curveTo(7.09961f, 5.27944f, 7.27909f, 5.09996f, 7.5f, 5.09996f)
                horizontalLineTo(14.5f)
                lineTo(14.5811f, 5.10875f)
                close()
                moveTo(14.5811f, 3.10875f)
                curveTo(14.763f, 3.14627f, 14.9004f, 3.30725f, 14.9004f, 3.50035f)
                curveTo(14.9002f, 3.69331f, 14.763f, 3.8545f, 14.5811f, 3.89195f)
                lineTo(14.5f, 3.90074f)
                horizontalLineTo(7.5f)
                curveTo(7.27922f, 3.90074f, 7.09982f, 3.72109f, 7.09961f, 3.50035f)
                curveTo(7.09961f, 3.27944f, 7.27909f, 3.09996f, 7.5f, 3.09996f)
                horizontalLineTo(14.5f)
                lineTo(14.5811f, 3.10875f)
                close()
            }
        }.build()
        
        return _DropdownMenu!!
    }

private var _DropdownMenu: ImageVector? = null

