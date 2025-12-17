package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Home_work: ImageVector
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
                moveTo(40f, 840f)
                verticalLineToRelative(-400f)
                lineToRelative(280f, -200f)
                lineToRelative(280f, 200f)
                verticalLineToRelative(400f)
                horizontalLineTo(400f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(40f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-440f)
                lineTo(400f, 198f)
                verticalLineToRelative(-78f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(720f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Home_work!!
    }

private var _Home_work: ImageVector? = null

