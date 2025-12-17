package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Thumb_up_off: ImageVector
    get() {
        if (_Thumb_up_off != null) return _Thumb_up_off!!
        
        _Thumb_up_off = ImageVector.Builder(
            name = "thumb_up_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                lineToRelative(7f, -7f)
                lineToRelative(1.25f, 1.25f)
                quadToRelative(0.175f, 0.175f, 0.288f, 0.475f)
                quadToRelative(0.112f, 0.3f, 0.112f, 0.575f)
                verticalLineToRelative(0.35f)
                lineTo(15.55f, 8f)
                horizontalLineTo(21f)
                quadToRelative(0.8f, 0f, 1.4f, 0.6f)
                quadToRelative(0.6f, 0.6f, 0.6f, 1.4f)
                verticalLineToRelative(2f)
                quadToRelative(0f, 0.175f, -0.038f, 0.375f)
                quadToRelative(-0.037f, 0.2f, -0.112f, 0.375f)
                lineToRelative(-3f, 7.05f)
                quadToRelative(-0.225f, 0.5f, -0.75f, 0.85f)
                reflectiveQuadTo(18f, 21f)
                close()
                moveTo(6f, 8f)
                verticalLineToRelative(13f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        
        return _Thumb_up_off!!
    }

private var _Thumb_up_off: ImageVector? = null

