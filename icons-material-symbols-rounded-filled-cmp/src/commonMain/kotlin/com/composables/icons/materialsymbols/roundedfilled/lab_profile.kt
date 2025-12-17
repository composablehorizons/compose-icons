package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Lab_profile: ImageVector
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
                moveTo(360f, 480f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 400f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 440f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 480f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 240f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 320f)
                close()
                moveToRelative(438f, 499f)
                lineTo(636f, 608f)
                quadToRelative(-17f, -23f, -42f, -35.5f)
                reflectiveQuadTo(540f, 560f)
                horizontalLineTo(160f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 5f, -0.5f, 9.5f)
                reflectiveQuadTo(798f, 819f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(380f)
                quadToRelative(10f, 0f, 18.5f, 4.5f)
                reflectiveQuadTo(573f, 657f)
                lineTo(741f, 877f)
                quadToRelative(-5f, 2f, -10.5f, 2.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Lab_profile!!
    }

private var _Lab_profile: ImageVector? = null

