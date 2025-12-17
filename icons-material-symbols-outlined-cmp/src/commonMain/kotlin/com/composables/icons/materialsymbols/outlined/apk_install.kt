package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Apk_install: ImageVector
    get() {
        if (_Apk_install != null) return _Apk_install!!
        
        _Apk_install = ImageVector.Builder(
            name = "apk_install",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(170f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-130f)
                horizontalLineTo(440f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(40f, -40f)
                quadToRelative(4f, -49f, 30f, -90f)
                reflectiveQuadToRelative(68f, -65f)
                lineToRelative(-38f, -68f)
                quadToRelative(0f, -1f, 4f, -15f)
                quadToRelative(5f, -2f, 9.5f, -2f)
                reflectiveQuadToRelative(6.5f, 5f)
                lineToRelative(39f, 70f)
                quadToRelative(20f, -8f, 40f, -12.5f)
                reflectiveQuadToRelative(41f, -4.5f)
                quadToRelative(21f, 0f, 41f, 4.5f)
                reflectiveQuadToRelative(40f, 12.5f)
                lineToRelative(39f, -70f)
                lineToRelative(15f, -4f)
                quadToRelative(5f, 2f, 6f, 7f)
                reflectiveQuadToRelative(-1f, 9f)
                lineToRelative(-38f, 68f)
                quadToRelative(42f, 24f, 68f, 65f)
                reflectiveQuadToRelative(30f, 90f)
                horizontalLineTo(200f)
                close()
                moveToRelative(110f, -60f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(180f, 0f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveTo(800f, 880f)
                lineTo(640f, 720f)
                lineToRelative(56f, -57f)
                lineToRelative(64f, 63f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(166f)
                lineToRelative(64f, -63f)
                lineToRelative(56f, 57f)
                lineTo(800f, 880f)
                close()
            }
        }.build()
        
        return _Apk_install!!
    }

private var _Apk_install: ImageVector? = null

