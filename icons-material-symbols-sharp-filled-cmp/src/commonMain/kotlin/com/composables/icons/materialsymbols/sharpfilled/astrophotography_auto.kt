package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Astrophotography_auto: ImageVector
    get() {
        if (_Astrophotography_auto != null) return _Astrophotography_auto!!
        
        _Astrophotography_auto = ImageVector.Builder(
            name = "astrophotography_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveTo(4.8f, 16f)
                lineTo(8f, 7f)
                horizontalLineToRelative(2f)
                lineToRelative(3.2f, 9f)
                horizontalLineToRelative(-1.9f)
                lineToRelative(-0.7f, -2f)
                horizontalLineTo(7.4f)
                lineToRelative(-0.7f, 2f)
                close()
                moveToRelative(3.05f, -3.35f)
                horizontalLineToRelative(2.3f)
                lineTo(9f, 9f)
                close()
                moveTo(9f, 18f)
                quadToRelative(2.5f, 0f, 4.25f, -1.75f)
                reflectiveQuadTo(15f, 12f)
                quadToRelative(0f, -2.5f, -1.75f, -4.25f)
                reflectiveQuadTo(9f, 6f)
                quadTo(6.5f, 6f, 4.75f, 7.75f)
                reflectiveQuadTo(3f, 12f)
                quadToRelative(0f, 2.5f, 1.75f, 4.25f)
                reflectiveQuadTo(9f, 18f)
                close()
                moveToRelative(0f, 2f)
                quadToRelative(-3.35f, 0f, -5.675f, -2.325f)
                quadTo(1f, 15.35f, 1f, 12f)
                quadToRelative(0f, -3.35f, 2.325f, -5.675f)
                quadTo(5.65f, 4f, 9f, 4f)
                quadToRelative(3.35f, 0f, 5.675f, 2.325f)
                quadTo(17f, 8.65f, 17f, 12f)
                quadToRelative(0f, 3.35f, -2.325f, 5.675f)
                quadTo(12.35f, 20f, 9f, 20f)
                close()
            }
        }.build()
        
        return _Astrophotography_auto!!
    }

private var _Astrophotography_auto: ImageVector? = null

