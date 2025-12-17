package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Lab_profile: ImageVector
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
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(480f, 502f)
                lineTo(599f, 560f)
                horizontalLineTo(160f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(742f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(400f)
                lineTo(744f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Lab_profile!!
    }

private var _Lab_profile: ImageVector? = null

