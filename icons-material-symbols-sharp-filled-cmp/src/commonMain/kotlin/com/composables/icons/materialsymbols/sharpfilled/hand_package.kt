package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hand_package: ImageVector
    get() {
        if (_Hand_package != null) return _Hand_package!!
        
        _Hand_package = ImageVector.Builder(
            name = "hand_package",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 440f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(360f)
                horizontalLineTo(280f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(360f)
                horizontalLineTo(680f)
                close()
                moveTo(320f, 840f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(272f)
                quadToRelative(14f, 0f, 24f, 8f)
                reflectiveQuadToRelative(14f, 19f)
                quadToRelative(4f, 11f, 1.5f, 23f)
                reflectiveQuadTo(618f, 591f)
                lineToRelative(-59f, 49f)
                horizontalLineTo(400f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(180f)
                lineToRelative(162f, -134f)
                quadToRelative(22f, -16f, 46.5f, -20f)
                reflectiveQuadToRelative(48.5f, 2f)
                quadToRelative(24f, 6f, 45.5f, 20.5f)
                reflectiveQuadTo(919f, 606f)
                lineTo(639f, 840f)
                horizontalLineTo(320f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(360f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Hand_package!!
    }

private var _Hand_package: ImageVector? = null

