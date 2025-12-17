package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Lab_profile: ImageVector
    get() {
        if (_Lab_profile != null) return _Lab_profile!!
        
        _Lab_profile = ImageVector.Builder(
            name = "lab_profile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-80f, 240f)
                horizontalLineToRelative(300f)
                quadToRelative(29f, 0f, 54f, 12.5f)
                reflectiveQuadToRelative(42f, 35.5f)
                lineToRelative(84f, 110f)
                verticalLineToRelative(-558f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(442f)
                lineTo(573f, 657f)
                quadToRelative(-6f, -8f, -14.5f, -12.5f)
                reflectiveQuadTo(540f, 640f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(480f, 80f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(-480f, -80f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Lab_profile!!
    }

private var _Lab_profile: ImageVector? = null

