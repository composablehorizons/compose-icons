package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.High_res: ImageVector
    get() {
        if (_High_res != null) return _High_res!!
        
        _High_res = ImageVector.Builder(
            name = "high_res",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 740f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineTo(460f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(400f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-140f)
                horizontalLineTo(660f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-60f)
                horizontalLineTo(600f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(40f)
                horizontalLineTo(600f)
                verticalLineToRelative(60f)
                close()
                moveTo(300f, 460f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(720f)
                horizontalLineTo(40f)
                close()
                moveToRelative(140f, -100f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(24f)
                lineToRelative(36f, 80f)
                horizontalLineToRelative(60f)
                lineToRelative(-36f, -84f)
                quadToRelative(15f, -9f, 25.5f, -23.5f)
                reflectiveQuadTo(360f, 600f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 500f)
                horizontalLineTo(180f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(60f, -140f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _High_res!!
    }

private var _High_res: ImageVector? = null

