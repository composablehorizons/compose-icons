package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShuttleVan: ImageVector
    get() {
        if (_ShuttleVan != null) return _ShuttleVan!!
        
        _ShuttleVan = ImageVector.Builder(
            name = "shuttle-van",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(628.88f, 210.65f)
                lineTo(494.39f, 49.27f)
                arcTo(48.01f, 48.01f, 0f, false, false, 457.52f, 32f)
                horizontalLineTo(32f)
                curveTo(14.33f, 32f, 0f, 46.33f, 0f, 64f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(32f)
                curveToRelative(0f, 53.02f, 42.98f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -42.98f, 96f, -96f)
                horizontalLineToRelative(128f)
                curveToRelative(0f, 53.02f, 42.98f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -42.98f, 96f, -96f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(241.38f)
                curveToRelative(0f, -11.23f, -3.94f, -22.1f, -11.12f, -30.73f)
                close()
                moveTo(64f, 192f)
                verticalLineTo(96f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(96f)
                horizontalLineTo(64f)
                close()
                moveToRelative(96f, 240f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                reflectiveCurveToRelative(21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                reflectiveCurveToRelative(-21.49f, 48f, -48f, 48f)
                close()
                moveToRelative(160f, -240f)
                horizontalLineToRelative(-96f)
                verticalLineTo(96f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(160f, 240f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                reflectiveCurveToRelative(21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                reflectiveCurveToRelative(-21.49f, 48f, -48f, 48f)
                close()
                moveToRelative(-96f, -240f)
                verticalLineTo(96f)
                horizontalLineToRelative(66.02f)
                lineToRelative(80f, 96f)
                horizontalLineTo(384f)
                close()
            }
        }.build()
        
        return _ShuttleVan!!
    }

private var _ShuttleVan: ImageVector? = null

