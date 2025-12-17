package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Astrophotography_off: ImageVector
    get() {
        if (_Astrophotography_off != null) return _Astrophotography_off!!
        
        _Astrophotography_off = ImageVector.Builder(
            name = "astrophotography_off",
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
                moveToRelative(0.775f, 13.6f)
                lineTo(1.4f, 4.225f)
                lineTo(2.8f, 2.8f)
                lineToRelative(4.65f, 4.65f)
                lineTo(9f, 4f)
                lineToRelative(2.5f, 5.5f)
                lineTo(17f, 12f)
                lineToRelative(-3.45f, 1.55f)
                lineToRelative(4.2f, 4.2f)
                lineTo(19f, 15f)
                lineToRelative(1.25f, 2.75f)
                lineTo(23f, 19f)
                lineToRelative(-2.75f, 1.25f)
                lineToRelative(0.925f, 0.95f)
                close()
                moveTo(9f, 20f)
                lineToRelative(-2.5f, -5.5f)
                lineTo(1f, 12f)
                lineToRelative(3.675f, -1.675f)
                lineToRelative(6f, 6f)
                close()
            }
        }.build()
        
        return _Astrophotography_off!!
    }

private var _Astrophotography_off: ImageVector? = null

