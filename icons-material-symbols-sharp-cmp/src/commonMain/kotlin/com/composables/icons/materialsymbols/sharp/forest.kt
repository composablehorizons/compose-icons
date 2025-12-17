package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Forest: ImageVector
    get() {
        if (_Forest != null) return _Forest!!
        
        _Forest = ImageVector.Builder(
            name = "forest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-160f)
                horizontalLineTo(0f)
                lineToRelative(154f, -240f)
                horizontalLineTo(80f)
                lineToRelative(280f, -400f)
                lineToRelative(120f, 172f)
                lineToRelative(120f, -172f)
                lineToRelative(280f, 400f)
                horizontalLineToRelative(-74f)
                lineToRelative(154f, 240f)
                horizontalLineTo(680f)
                verticalLineToRelative(160f)
                horizontalLineTo(520f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineTo(280f)
                close()
                moveToRelative(389f, -240f)
                horizontalLineToRelative(145f)
                lineTo(659f, 400f)
                horizontalLineToRelative(67f)
                lineTo(600f, 220f)
                lineToRelative(-71f, 101f)
                lineToRelative(111f, 159f)
                horizontalLineToRelative(-74f)
                lineToRelative(103f, 160f)
                close()
                moveToRelative(-523f, 0f)
                horizontalLineToRelative(428f)
                lineTo(419f, 400f)
                horizontalLineToRelative(67f)
                lineTo(360f, 220f)
                lineTo(234f, 400f)
                horizontalLineToRelative(67f)
                lineTo(146f, 640f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(155f)
                horizontalLineToRelative(-67f)
                horizontalLineToRelative(252f)
                horizontalLineToRelative(-67f)
                horizontalLineToRelative(155f)
                horizontalLineToRelative(-428f)
                close()
                moveToRelative(523f, 0f)
                horizontalLineTo(566f)
                horizontalLineToRelative(74f)
                horizontalLineToRelative(-111f)
                horizontalLineToRelative(197f)
                horizontalLineToRelative(-67f)
                horizontalLineToRelative(155f)
                horizontalLineToRelative(-145f)
                close()
                moveToRelative(-149f, 80f)
                horizontalLineToRelative(160f)
                horizontalLineToRelative(-160f)
                close()
                moveToRelative(201f, 0f)
                close()
            }
        }.build()
        
        return _Forest!!
    }

private var _Forest: ImageVector? = null

