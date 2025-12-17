package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Crop: ImageVector
    get() {
        if (_Crop != null) return _Crop!!
        
        _Crop = ImageVector.Builder(
            name = "crop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(488f, 352f)
                horizontalLineToRelative(-40f)
                verticalLineTo(109.25f)
                lineToRelative(59.31f, -59.31f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0f, -22.63f)
                lineTo(484.69f, 4.69f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0f)
                lineTo(402.75f, 64f)
                horizontalLineTo(192f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(114.75f)
                lineTo(160f, 306.75f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.26f, -10.75f, -24f, -24f, -24f)
                horizontalLineTo(88f)
                curveTo(74.75f, 0f, 64f, 10.74f, 64f, 24f)
                verticalLineToRelative(40f)
                horizontalLineTo(24f)
                curveTo(10.75f, 64f, 0f, 74.74f, 0f, 88f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(264f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(232f)
                verticalLineToRelative(-96f)
                horizontalLineTo(205.25f)
                lineTo(352f, 205.25f)
                verticalLineTo(488f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(48f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -13.26f, -10.75f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _Crop!!
    }

private var _Crop: ImageVector? = null

