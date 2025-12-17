package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Open_run: ImageVector
    get() {
        if (_Open_run != null) return _Open_run!!
        
        _Open_run = ImageVector.Builder(
            name = "open_run",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 767f)
                lineToRelative(85f, -85f)
                lineToRelative(57f, 56f)
                lineTo(480f, 880f)
                lineTo(338f, 738f)
                lineToRelative(57f, -56f)
                lineToRelative(85f, 85f)
                close()
                moveTo(193f, 480f)
                lineToRelative(85f, 85f)
                lineToRelative(-56f, 57f)
                lineTo(80f, 480f)
                lineToRelative(142f, -142f)
                lineToRelative(56f, 57f)
                lineToRelative(-85f, 85f)
                close()
                moveToRelative(574f, 0f)
                lineToRelative(-85f, -85f)
                lineToRelative(56f, -57f)
                lineToRelative(142f, 142f)
                lineToRelative(-142f, 142f)
                lineToRelative(-56f, -57f)
                lineToRelative(85f, -85f)
                close()
                moveTo(480f, 193f)
                lineToRelative(-85f, 85f)
                lineToRelative(-57f, -56f)
                lineToRelative(142f, -142f)
                lineToRelative(142f, 142f)
                lineToRelative(-57f, 56f)
                lineToRelative(-85f, -85f)
                close()
            }
        }.build()
        
        return _Open_run!!
    }

private var _Open_run: ImageVector? = null

