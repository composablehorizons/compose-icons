package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CalendarWeek: ImageVector
    get() {
        if (_CalendarWeek != null) return _CalendarWeek!!
        
        _CalendarWeek = ImageVector.Builder(
            name = "calendar-week",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 2f)
                curveToRelative(0.183f, 0f, 0.355f, 0.05f, 0.502f, 0.135f)
                lineToRelative(0.033f, 0.02f)
                curveToRelative(0.28f, 0.177f, 0.465f, 0.49f, 0.465f, 0.845f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 0.514f, -0.874f)
                lineToRelative(0.093f, -0.046f)
                lineToRelative(0.066f, -0.025f)
                lineToRelative(0.1f, -0.029f)
                lineToRelative(0.107f, -0.019f)
                lineToRelative(0.12f, -0.007f)
                quadToRelative(0.083f, 0f, 0.161f, 0.013f)
                lineToRelative(0.122f, 0.029f)
                lineToRelative(0.04f, 0.012f)
                lineToRelative(0.06f, 0.023f)
                curveToRelative(0.328f, 0.135f, 0.568f, 0.44f, 0.61f, 0.806f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(3f, 7f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(9.625f)
                curveToRelative(0f, 0.705f, 0.386f, 1.286f, 0.883f, 1.366f)
                lineToRelative(0.117f, 0.009f)
                horizontalLineToRelative(12f)
                curveToRelative(0.513f, 0f, 0.936f, -0.53f, 0.993f, -1.215f)
                lineToRelative(0.007f, -0.16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.015f, 13f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                arcToRelative(1.001f, 1.001f, 0f, true, true, -0.005f, -2f)
                curveToRelative(0.557f, 0f, 1.005f, 0.448f, 1.005f, 1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.015f, 13f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                arcToRelative(1.001f, 1.001f, 0f, true, true, -0.005f, -2f)
                curveToRelative(0.557f, 0f, 1.005f, 0.448f, 1.005f, 1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.02f, 13f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                arcToRelative(1.001f, 1.001f, 0f, true, true, -0.005f, -2f)
                curveToRelative(0.557f, 0f, 1.005f, 0.448f, 1.005f, 1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.02f, 15f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                arcToRelative(1.001f, 1.001f, 0f, true, true, -0.005f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.015f, 16f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                arcToRelative(1.001f, 1.001f, 0f, true, true, -0.005f, -2f)
                curveToRelative(0.557f, 0f, 1.005f, 0.448f, 1.005f, 1f)
            }
        }.build()
        
        return _CalendarWeek!!
    }

private var _CalendarWeek: ImageVector? = null

