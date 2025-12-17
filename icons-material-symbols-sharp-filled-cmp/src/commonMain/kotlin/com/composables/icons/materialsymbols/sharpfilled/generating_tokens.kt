package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Generating_tokens: ImageVector
    get() {
        if (_Generating_tokens != null) return _Generating_tokens!!
        
        _Generating_tokens = ImageVector.Builder(
            name = "generating_tokens",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 20f)
                quadToRelative(-3.35f, 0f, -5.675f, -2.325f)
                quadTo(1f, 15.35f, 1f, 12f)
                quadToRelative(0f, -3.35f, 2.325f, -5.675f)
                quadTo(5.65f, 4f, 9f, 4f)
                quadToRelative(3.35f, 0f, 5.675f, 2.325f)
                quadTo(17f, 8.65f, 17f, 12f)
                quadToRelative(0f, 3.35f, -2.325f, 5.675f)
                quadTo(12.35f, 20f, 9f, 20f)
                close()
                moveToRelative(-1f, -4.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 9f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(15f, 5f)
                lineToRelative(2.75f, -1.25f)
                lineTo(19f, 1f)
                lineToRelative(1.25f, 2.75f)
                lineTo(23f, 5f)
                lineToRelative(-2.75f, 1.25f)
                close()
                moveToRelative(0f, 14f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(15f, 19f)
                lineToRelative(2.75f, -1.25f)
                lineTo(19f, 15f)
                lineToRelative(1.25f, 2.75f)
                lineTo(23f, 19f)
                lineToRelative(-2.75f, 1.25f)
                close()
            }
        }.build()
        
        return _Generating_tokens!!
    }

private var _Generating_tokens: ImageVector? = null

