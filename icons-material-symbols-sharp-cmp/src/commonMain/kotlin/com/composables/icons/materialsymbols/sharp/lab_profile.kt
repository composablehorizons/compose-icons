package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Lab_profile: ImageVector
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
                horizontalLineToRelative(359f)
                lineToRelative(121f, 158f)
                verticalLineToRelative(-558f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(442f)
                lineTo(560f, 640f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(560f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                close()
                moveToRelative(-560f, -80f)
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

