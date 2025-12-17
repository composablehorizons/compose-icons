package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Female: ImageVector
    get() {
        if (_Female != null) return _Female!!
        
        _Female = ImageVector.Builder(
            name = "female",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 0f)
                curveToRelative(35.346f, 0f, 64f, 28.654f, 64f, 64f)
                reflectiveCurveToRelative(-28.654f, 64f, -64f, 64f)
                curveToRelative(-35.346f, 0f, -64f, -28.654f, -64f, -64f)
                reflectiveCurveTo(92.654f, 0f, 128f, 0f)
                moveToRelative(119.283f, 354.179f)
                lineToRelative(-48f, -192f)
                arcTo(24f, 24f, 0f, false, false, 176f, 144f)
                horizontalLineToRelative(-11.36f)
                curveToRelative(-22.711f, 10.443f, -49.59f, 10.894f, -73.28f, 0f)
                horizontalLineTo(80f)
                arcToRelative(24f, 24f, 0f, false, false, -23.283f, 18.179f)
                lineToRelative(-48f, 192f)
                curveTo(4.935f, 369.305f, 16.383f, 384f, 32f, 384f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(32f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(384f)
                horizontalLineToRelative(56f)
                curveToRelative(15.591f, 0f, 27.071f, -14.671f, 23.283f, -29.821f)
                close()
            }
        }.build()
        
        return _Female!!
    }

private var _Female: ImageVector? = null

