package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Temple_hindu: ImageVector
    get() {
        if (_Temple_hindu != null) return _Temple_hindu!!
        
        _Temple_hindu = ImageVector.Builder(
            name = "temple_hindu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                lineToRelative(119f, -395f)
                verticalLineToRelative(-85f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(81f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                lineToRelative(120f, 400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(268f, -440f)
                horizontalLineToRelative(264f)
                lineToRelative(-24f, -80f)
                horizontalLineTo(372f)
                lineToRelative(-24f, 80f)
                close()
                moveToRelative(48f, -160f)
                horizontalLineToRelative(168f)
                lineToRelative(-24f, -80f)
                horizontalLineTo(420f)
                lineToRelative(-24f, 80f)
                close()
                moveTo(160f, 800f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineTo(660f)
                lineToRelative(-24f, -80f)
                horizontalLineTo(324f)
                lineToRelative(-24f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(320f, -300f)
                close()
            }
        }.build()
        
        return _Temple_hindu!!
    }

private var _Temple_hindu: ImageVector? = null

