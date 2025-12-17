package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ScubaDivingTank: ImageVector
    get() {
        if (_ScubaDivingTank != null) return _ScubaDivingTank!!
        
        _ScubaDivingTank = ImageVector.Builder(
            name = "scuba-diving-tank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 17f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.732f, 1f)
                horizontalLineToRelative(1.15f)
                arcToRelative(1.496f, 1.496f, 0f, false, true, 2.236f, 0f)
                horizontalLineToRelative(1.882f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                lineToRelative(-1.883f, 0.001f)
                arcToRelative(2f, 2f, 0f, false, true, -0.115f, 0.116f)
                verticalLineToRelative(0.983f)
                arcToRelative(5f, 5f, 0f, false, true, 3.998f, 4.9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-4f)
                arcToRelative(5f, 5f, 0f, false, true, 4f, -4.9f)
                verticalLineToRelative(-0.983f)
                arcToRelative(2f, 2f, 0f, false, true, -0.117f, -0.116f)
                horizontalLineToRelative(-1.151f)
                arcToRelative(2f, 2f, 0f, true, true, -1.732f, -3.001f)
            }
        }.build()
        
        return _ScubaDivingTank!!
    }

private var _ScubaDivingTank: ImageVector? = null

