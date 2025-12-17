package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Random: ImageVector
    get() {
        if (_Random != null) return _Random!!
        
        _Random = ImageVector.Builder(
            name = "random",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504.971f, 359.029f)
                curveToRelative(9.373f, 9.373f, 9.373f, 24.569f, 0f, 33.941f)
                lineToRelative(-80f, 79.984f)
                curveToRelative(-15.01f, 15.01f, -40.971f, 4.49f, -40.971f, -16.971f)
                verticalLineTo(416f)
                horizontalLineToRelative(-58.785f)
                arcToRelative(12.004f, 12.004f, 0f, false, true, -8.773f, -3.812f)
                lineToRelative(-70.556f, -75.596f)
                lineToRelative(53.333f, -57.143f)
                lineTo(352f, 336f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-39.981f)
                curveToRelative(0f, -21.438f, 25.943f, -31.998f, 40.971f, -16.971f)
                lineToRelative(80f, 79.981f)
                close()
                moveTo(12f, 176f)
                horizontalLineToRelative(84f)
                lineToRelative(52.781f, 56.551f)
                lineToRelative(53.333f, -57.143f)
                lineToRelative(-70.556f, -75.596f)
                arcTo(11.999f, 11.999f, 0f, false, false, 122.785f, 96f)
                horizontalLineTo(12f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                close()
                moveToRelative(372f, 0f)
                verticalLineToRelative(39.984f)
                curveToRelative(0f, 21.46f, 25.961f, 31.98f, 40.971f, 16.971f)
                lineToRelative(80f, -79.984f)
                curveToRelative(9.373f, -9.373f, 9.373f, -24.569f, 0f, -33.941f)
                lineToRelative(-80f, -79.981f)
                curveTo(409.943f, 24.021f, 384f, 34.582f, 384f, 56.019f)
                verticalLineTo(96f)
                horizontalLineToRelative(-58.785f)
                arcToRelative(12.004f, 12.004f, 0f, false, false, -8.773f, 3.812f)
                lineTo(96f, 336f)
                horizontalLineTo(12f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(110.785f)
                curveToRelative(3.326f, 0f, 6.503f, -1.381f, 8.773f, -3.812f)
                lineTo(352f, 176f)
                horizontalLineToRelative(32f)
                close()
            }
        }.build()
        
        return _Random!!
    }

private var _Random: ImageVector? = null

