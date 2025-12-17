package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Autopay: ImageVector
    get() {
        if (_Autopay != null) return _Autopay!!
        
        _Autopay = ImageVector.Builder(
            name = "autopay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 23f)
                quadToRelative(-2.8f, 0f, -5.15f, -1.288f)
                quadTo(4.5f, 20.425f, 3f, 18.3f)
                verticalLineTo(20f)
                horizontalLineTo(1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(4.55f)
                quadToRelative(1.2f, 1.8f, 3.15f, 2.9f)
                quadTo(9.65f, 21f, 12f, 21f)
                quadToRelative(1.875f, 0f, 3.513f, -0.712f)
                quadToRelative(1.637f, -0.713f, 2.85f, -1.926f)
                quadToRelative(1.212f, -1.212f, 1.925f, -2.85f)
                quadTo(21f, 13.875f, 21f, 12f)
                horizontalLineToRelative(2f)
                quadToRelative(0f, 2.275f, -0.862f, 4.275f)
                quadToRelative(-0.863f, 2f, -2.363f, 3.5f)
                reflectiveQuadToRelative(-3.5f, 2.362f)
                quadTo(14.275f, 23f, 12f, 23f)
                close()
                moveTo(7.35f, 4.325f)
                lineToRelative(-0.85f, -1.85f)
                quadToRelative(1.275f, -0.725f, 2.588f, -1.1f)
                quadTo(10.4f, 1f, 12f, 1f)
                quadToRelative(2.8f, 0f, 5.15f, 1.287f)
                quadTo(19.5f, 3.575f, 21f, 5.7f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineTo(7f)
                horizontalLineToRelative(1.45f)
                quadToRelative(-1.2f, -1.8f, -3.15f, -2.9f)
                quadTo(14.35f, 3f, 12f, 3f)
                quadToRelative(-1.325f, 0f, -2.462f, 0.362f)
                quadToRelative(-1.138f, 0.363f, -2.188f, 0.963f)
                close()
                moveTo(4f, 12f)
                lineTo(2.75f, 9.25f)
                lineTo(0f, 8f)
                lineToRelative(2.75f, -1.25f)
                lineTo(4f, 4f)
                lineToRelative(1.25f, 2.75f)
                lineTo(8f, 8f)
                lineTo(5.25f, 9.25f)
                close()
                moveToRelative(3.8f, 4f)
                lineToRelative(3.4f, -9f)
                horizontalLineToRelative(1.6f)
                lineToRelative(3.4f, 9f)
                horizontalLineToRelative(-1.55f)
                lineToRelative(-0.8f, -2.3f)
                horizontalLineTo(10.2f)
                lineTo(9.4f, 16f)
                close()
                moveToRelative(2.85f, -3.6f)
                horizontalLineToRelative(2.7f)
                lineToRelative(-1.3f, -3.75f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }.build()
        
        return _Autopay!!
    }

private var _Autopay: ImageVector? = null

