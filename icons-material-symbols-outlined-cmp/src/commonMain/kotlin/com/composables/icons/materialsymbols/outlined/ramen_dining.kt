package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Ramen_dining: ImageVector
    get() {
        if (_Ramen_dining != null) return _Ramen_dining!!
        
        _Ramen_dining = ImageVector.Builder(
            name = "ramen_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 800f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-44f)
                lineToRelative(50f, -20f)
                quadToRelative(65f, -26f, 110.5f, -72.5f)
                reflectiveQuadTo(786f, 560f)
                horizontalLineTo(174f)
                quadToRelative(20f, 57f, 65f, 103.5f)
                reflectiveQuadTo(350f, 736f)
                lineToRelative(50f, 20f)
                verticalLineToRelative(44f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-70f)
                quadToRelative(-107f, -42f, -173.5f, -130f)
                reflectiveQuadTo(80f, 480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-320f)
                lineToRelative(720f, -80f)
                verticalLineToRelative(60f)
                lineToRelative(-460f, 52f)
                verticalLineToRelative(68f)
                horizontalLineToRelative(460f)
                verticalLineToRelative(60f)
                horizontalLineTo(420f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(460f)
                quadToRelative(0f, 112f, -66.5f, 200f)
                reflectiveQuadTo(640f, 810f)
                verticalLineToRelative(70f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -620f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-62f)
                lineToRelative(-40f, 5f)
                verticalLineToRelative(57f)
                close()
                moveToRelative(-100f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-50f)
                lineToRelative(-40f, 4f)
                verticalLineToRelative(46f)
                close()
                moveToRelative(100f, 220f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-100f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(260f, 80f)
                close()
            }
        }.build()
        
        return _Ramen_dining!!
    }

private var _Ramen_dining: ImageVector? = null

