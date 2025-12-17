package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserTag: ImageVector
    get() {
        if (_UserTag != null) return _UserTag!!
        
        _UserTag = ImageVector.Builder(
            name = "user-tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(630.6f, 364.9f)
                lineToRelative(-90.3f, -90.2f)
                curveToRelative(-12f, -12f, -28.3f, -18.7f, -45.3f, -18.7f)
                horizontalLineToRelative(-79.3f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(79.2f)
                curveToRelative(0f, 17f, 6.7f, 33.2f, 18.7f, 45.2f)
                lineToRelative(90.3f, 90.2f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0f)
                lineToRelative(92.5f, -92.5f)
                curveToRelative(12.6f, -12.5f, 12.6f, -32.7f, 0.1f, -45.2f)
                close()
                moveToRelative(-182.8f, -21f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.7f, 24f, 24f)
                curveToRelative(0f, 13.2f, -10.7f, 24f, -24f, 24f)
                close()
                moveToRelative(-223.8f, -88f)
                curveToRelative(70.7f, 0f, 128f, -57.3f, 128f, -128f)
                curveTo(352f, 57.3f, 294.7f, 0f, 224f, 0f)
                reflectiveCurveTo(96f, 57.3f, 96f, 128f)
                curveToRelative(0f, 70.6f, 57.3f, 127.9f, 128f, 127.9f)
                close()
                moveToRelative(127.8f, 111.2f)
                verticalLineTo(294f)
                curveToRelative(-12.2f, -3.6f, -24.9f, -6.2f, -38.2f, -6.2f)
                horizontalLineToRelative(-16.7f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16f, -72.9f, 16f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16f)
                horizontalLineToRelative(-16.7f)
                curveTo(60.2f, 287.9f, 0f, 348.1f, 0f, 422.3f)
                verticalLineToRelative(41.6f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(15.5f, 0f, 29.1f, -7.5f, 37.9f, -18.9f)
                lineToRelative(-58f, -58f)
                curveToRelative(-18.1f, -18.1f, -28.1f, -42.2f, -28.1f, -67.9f)
                close()
            }
        }.build()
        
        return _UserTag!!
    }

private var _UserTag: ImageVector? = null

