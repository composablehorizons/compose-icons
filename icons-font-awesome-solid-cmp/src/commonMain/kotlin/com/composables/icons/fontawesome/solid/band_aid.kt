package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BandAid: ImageVector
    get() {
        if (_BandAid != null) return _BandAid!!
        
        _BandAid = ImageVector.Builder(
            name = "band-aid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 160f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 35.3f, 28.7f, 64f, 64f, 64f)
                horizontalLineToRelative(96f)
                verticalLineTo(96f)
                horizontalLineTo(64f)
                curveToRelative(-35.3f, 0f, -64f, 28.7f, -64f, 64f)
                close()
                moveToRelative(576f, -64f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(96f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                verticalLineTo(160f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                close()
                moveTo(192f, 416f)
                horizontalLineToRelative(256f)
                verticalLineTo(96f)
                horizontalLineTo(192f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(176f, -232f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                close()
                moveToRelative(-96f, -96f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                close()
                moveToRelative(0f, 96f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                reflectiveCurveToRelative(-10.7f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.7f, -24f, -24f)
                reflectiveCurveToRelative(10.7f, -24f, 24f, -24f)
                close()
            }
        }.build()
        
        return _BandAid!!
    }

private var _BandAid: ImageVector? = null

