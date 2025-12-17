package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Linked_camera: ImageVector
    get() {
        if (_Linked_camera != null) return _Linked_camera!!
        
        _Linked_camera = ImageVector.Builder(
            name = "linked_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                close()
                moveToRelative(346f, -240f)
                quadToRelative(0f, -78f, -54f, -132f)
                reflectiveQuadToRelative(-132f, -54f)
                verticalLineToRelative(-54f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                horizontalLineToRelative(-54f)
                close()
                moveToRelative(-106f, 0f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(640f, 200f)
                verticalLineToRelative(-54f)
                quadToRelative(55f, 0f, 93.5f, 39f)
                reflectiveQuadToRelative(40.5f, 95f)
                horizontalLineToRelative(-54f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(206f)
                lineToRelative(74f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(395f)
                lineToRelative(-73f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(520f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -140f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(660f, 520f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 700f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
            }
        }.build()
        
        return _Linked_camera!!
    }

private var _Linked_camera: ImageVector? = null

