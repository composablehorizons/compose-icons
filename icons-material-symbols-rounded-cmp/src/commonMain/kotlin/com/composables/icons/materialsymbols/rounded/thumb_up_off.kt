package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Thumb_up_off: ImageVector
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
                moveTo(7f, 21f)
                verticalLineTo(8f)
                lineToRelative(6f, -5.95f)
                quadToRelative(0.375f, -0.375f, 0.887f, -0.438f)
                quadToRelative(0.513f, -0.062f, 0.988f, 0.188f)
                reflectiveQuadToRelative(0.7f, 0.7f)
                quadToRelative(0.225f, 0.45f, 0.1f, 0.925f)
                lineTo(14.55f, 8f)
                horizontalLineTo(21f)
                quadToRelative(0.8f, 0f, 1.4f, 0.6f)
                quadToRelative(0.6f, 0.6f, 0.6f, 1.4f)
                verticalLineToRelative(2f)
                quadToRelative(0f, 0.175f, -0.05f, 0.375f)
                reflectiveQuadToRelative(-0.1f, 0.375f)
                lineToRelative(-3f, 7.05f)
                quadToRelative(-0.225f, 0.5f, -0.75f, 0.85f)
                reflectiveQuadTo(18f, 21f)
                close()
                moveTo(9f, 8.85f)
                verticalLineTo(19f)
                horizontalLineToRelative(9f)
                lineToRelative(3f, -7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-9f)
                lineToRelative(1.35f, -5.5f)
                close()
                moveTo(4f, 21f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 19.825f, 2f, 19f)
                verticalLineToRelative(-9f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(3.175f, 8f, 4f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(5f, -2f)
                verticalLineTo(8.85f)
                verticalLineTo(19f)
                close()
            }
        }.build()
        
        return _Thumb_up_off!!
    }

private var _Thumb_up_off: ImageVector? = null

