package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Auto_mode: ImageVector
    get() {
        if (_Auto_mode != null) return _Auto_mode!!
        
        _Auto_mode = ImageVector.Builder(
            name = "auto_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 17f)
                lineToRelative(-1.55f, -3.45f)
                lineTo(7f, 12f)
                lineToRelative(3.45f, -1.575f)
                lineTo(12f, 7f)
                lineToRelative(1.575f, 3.425f)
                lineTo(17f, 12f)
                lineToRelative(-3.425f, 1.55f)
                close()
                moveToRelative(0f, 6f)
                quadToRelative(-2.7f, 0f, -5.062f, -1.238f)
                quadTo(4.575f, 20.525f, 3f, 18.3f)
                verticalLineTo(21f)
                horizontalLineTo(1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(4.55f)
                quadToRelative(1.275f, 1.875f, 3.237f, 2.938f)
                quadTo(9.75f, 21f, 12f, 21f)
                quadToRelative(2.875f, 0f, 5.212f, -1.65f)
                quadToRelative(2.338f, -1.65f, 3.288f, -4.375f)
                lineToRelative(1.95f, 0.45f)
                quadToRelative(-1.125f, 3.4f, -4f, 5.488f)
                quadTo(15.575f, 23f, 12f, 23f)
                close()
                moveTo(1.05f, 11f)
                quadToRelative(0.175f, -1.675f, 0.8f, -3.213f)
                quadToRelative(0.625f, -1.537f, 1.725f, -2.837f)
                lineTo(5f, 6.375f)
                quadTo(4.2f, 7.4f, 3.7f, 8.562f)
                quadTo(3.2f, 9.725f, 3.075f, 11f)
                close()
                moveTo(6.4f, 4.975f)
                lineTo(4.975f, 3.55f)
                quadToRelative(1.325f, -1.1f, 2.85f, -1.738f)
                quadTo(9.35f, 1.175f, 11f, 1.05f)
                verticalLineToRelative(2f)
                quadToRelative(-1.275f, 0.125f, -2.425f, 0.625f)
                reflectiveQuadTo(6.4f, 4.975f)
                close()
                moveToRelative(11.225f, 0f)
                quadToRelative(-1.025f, -0.8f, -2.187f, -1.3f)
                quadToRelative(-1.163f, -0.5f, -2.438f, -0.625f)
                verticalLineToRelative(-2f)
                quadToRelative(1.675f, 0.15f, 3.212f, 0.775f)
                quadToRelative(1.538f, 0.625f, 2.838f, 1.725f)
                close()
                moveTo(20.95f, 11f)
                quadToRelative(-0.125f, -1.275f, -0.625f, -2.438f)
                quadToRelative(-0.5f, -1.162f, -1.3f, -2.187f)
                lineTo(20.45f, 4.95f)
                quadToRelative(1.1f, 1.3f, 1.725f, 2.837f)
                quadToRelative(0.625f, 1.538f, 0.775f, 3.213f)
                close()
            }
        }.build()
        
        return _Auto_mode!!
    }

private var _Auto_mode: ImageVector? = null

