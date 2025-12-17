package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Business_center: ImageVector
    get() {
        if (_Business_center != null) return _Business_center!!
        
        _Business_center = ImageVector.Builder(
            name = "business_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(400f, 360f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-160f)
                close()
                moveToRelative(-360f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-280f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(320f, 40f)
                close()
            }
        }.build()
        
        return _Business_center!!
    }

private var _Business_center: ImageVector? = null

