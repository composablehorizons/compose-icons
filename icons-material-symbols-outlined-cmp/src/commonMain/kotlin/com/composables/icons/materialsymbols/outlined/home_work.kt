package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Home_work: ImageVector
    get() {
        if (_Home_work != null) return _Home_work!!
        
        _Home_work = ImageVector.Builder(
            name = "home_work",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-560f)
                horizontalLineTo(480f)
                verticalLineToRelative(56f)
                lineToRelative(-80f, -58f)
                verticalLineToRelative(-78f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(720f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-640f, 0f)
                verticalLineToRelative(-400f)
                lineToRelative(280f, -200f)
                lineToRelative(280f, 200f)
                verticalLineToRelative(400f)
                horizontalLineTo(360f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                lineTo(320f, 338f)
                lineTo(120f, 480f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(560f, -360f)
                close()
                moveTo(440f, 760f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Home_work!!
    }

private var _Home_work: ImageVector? = null

