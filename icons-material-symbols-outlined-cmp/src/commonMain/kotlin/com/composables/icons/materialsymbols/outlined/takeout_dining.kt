package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Takeout_dining: ImageVector
    get() {
        if (_Takeout_dining != null) return _Takeout_dining!!
        
        _Takeout_dining = ImageVector.Builder(
            name = "takeout_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 720f)
                horizontalLineToRelative(338f)
                lineToRelative(19f, -280f)
                horizontalLineTo(292f)
                lineToRelative(20f, 280f)
                close()
                moveToRelative(-26f, -360f)
                horizontalLineToRelative(389f)
                lineToRelative(3f, -50f)
                lineToRelative(-112f, -110f)
                horizontalLineTo(394f)
                lineTo(282f, 310f)
                lineToRelative(4f, 50f)
                close()
                moveToRelative(-76f, 68f)
                lineTo(80f, 298f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 64f)
                lineToRelative(-2f, -24f)
                lineToRelative(162f, -162f)
                horizontalLineToRelative(240f)
                lineToRelative(162f, 162f)
                lineToRelative(-2f, 24f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 56f)
                lineToRelative(-130f, 130f)
                horizontalLineTo(210f)
                close()
                moveToRelative(28f, 372f)
                lineToRelative(-28f, -372f)
                horizontalLineToRelative(540f)
                lineToRelative(-28f, 372f)
                horizontalLineTo(238f)
                close()
                moveToRelative(242f, -440f)
                close()
                moveToRelative(1f, 80f)
                close()
            }
        }.build()
        
        return _Takeout_dining!!
    }

private var _Takeout_dining: ImageVector? = null

