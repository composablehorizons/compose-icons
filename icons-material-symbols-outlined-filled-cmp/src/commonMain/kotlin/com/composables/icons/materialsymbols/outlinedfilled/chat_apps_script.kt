package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Chat_apps_script: ImageVector
    get() {
        if (_Chat_apps_script != null) return _Chat_apps_script!!
        
        _Chat_apps_script = ImageVector.Builder(
            name = "chat_apps_script",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-600f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(203f)
                quadToRelative(-10f, -2f, -20f, -2.5f)
                reflectiveQuadToRelative(-20f, -0.5f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 10f, 0.5f, 20f)
                reflectiveQuadToRelative(2.5f, 20f)
                horizontalLineTo(240f)
                lineTo(120f, 800f)
                close()
                moveToRelative(160f, -440f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(298f, 280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(538f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(578f, 720f)
                horizontalLineToRelative(113f)
                lineToRelative(-92f, -65f)
                quadToRelative(-14f, -10f, -16.5f, -25.5f)
                reflectiveQuadTo(589f, 600f)
                quadToRelative(9f, -14f, 25f, -16.5f)
                reflectiveQuadToRelative(30f, 6.5f)
                lineToRelative(93f, 64f)
                lineToRelative(-39f, -106f)
                quadToRelative(-6f, -15f, 1f, -30f)
                reflectiveQuadToRelative(23f, -21f)
                quadToRelative(16f, -6f, 31f, 1f)
                reflectiveQuadToRelative(21f, 23f)
                lineToRelative(38f, 106f)
                lineToRelative(30f, -109f)
                quadToRelative(5f, -16f, 18.5f, -24.5f)
                reflectiveQuadTo(890f, 490f)
                quadToRelative(16f, 5f, 24.5f, 18.5f)
                reflectiveQuadTo(918f, 538f)
                lineToRelative(-70f, 262f)
                horizontalLineTo(578f)
                close()
            }
        }.build()
        
        return _Chat_apps_script!!
    }

private var _Chat_apps_script: ImageVector? = null

