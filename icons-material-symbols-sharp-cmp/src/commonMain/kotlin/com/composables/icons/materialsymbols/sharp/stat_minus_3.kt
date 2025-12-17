package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stat_minus_3: ImageVector
    get() {
        if (_Stat_minus_3 != null) return _Stat_minus_3!!
        
        _Stat_minus_3 = ImageVector.Builder(
            name = "stat_minus_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 877f)
                lineTo(240f, 637f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 183f)
                lineToRelative(184f, -183f)
                lineToRelative(56f, 56f)
                lineTo(480f, 877f)
                close()
                moveToRelative(0f, -238f)
                lineTo(240f, 399f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 183f)
                lineToRelative(184f, -183f)
                lineToRelative(56f, 56f)
                lineToRelative(-240f, 240f)
                close()
                moveToRelative(0f, -238f)
                lineTo(240f, 161f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 183f)
                lineToRelative(184f, -183f)
                lineToRelative(56f, 56f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Stat_minus_3!!
    }

private var _Stat_minus_3: ImageVector? = null

