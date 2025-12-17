package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Closed_caption_disabled: ImageVector
    get() {
        if (_Closed_caption_disabled != null) return _Closed_caption_disabled!!
        
        _Closed_caption_disabled = ImageVector.Builder(
            name = "closed_caption_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.83f, 4f)
                horizontalLineTo(21f)
                verticalLineToRelative(14.17f)
                lineTo(17.83f, 15f)
                horizontalLineTo(18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.17f)
                lineToRelative(-1.83f, -1.83f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1.17f)
                lineTo(6.83f, 4f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(17.17f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(5.83f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(11f, 13.83f)
                lineTo(10.17f, 13f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.17f)
                lineTo(6.17f, 9f)
                horizontalLineTo(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                verticalLineTo(13.83f)
                close()
            }
        }.build()
        
        return _Closed_caption_disabled!!
    }

private var _Closed_caption_disabled: ImageVector? = null

