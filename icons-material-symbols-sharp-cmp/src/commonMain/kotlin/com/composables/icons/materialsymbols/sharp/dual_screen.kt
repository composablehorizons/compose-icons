package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Dual_screen: ImageVector
    get() {
        if (_Dual_screen != null) return _Dual_screen!!
        
        _Dual_screen = ImageVector.Builder(
            name = "dual_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 704f)
                lineToRelative(240f, 96f)
                verticalLineToRelative(-544f)
                lineToRelative(-240f, -96f)
                verticalLineToRelative(544f)
                close()
                moveToRelative(-80f, 54f)
                verticalLineToRelative(-678f)
                horizontalLineToRelative(80f)
                lineToRelative(320f, 121f)
                verticalLineToRelative(717f)
                lineTo(160f, 758f)
                close()
                moveToRelative(320f, 2f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-520f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(680f)
                horizontalLineTo(480f)
                close()
                moveToRelative(-240f, -56f)
                verticalLineToRelative(-544f)
                verticalLineToRelative(544f)
                close()
            }
        }.build()
        
        return _Dual_screen!!
    }

private var _Dual_screen: ImageVector? = null

