package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Send_time_extension: ImageVector
    get() {
        if (_Send_time_extension != null) return _Send_time_extension!!
        
        _Send_time_extension = ImageVector.Builder(
            name = "send_time_extension",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 880f)
                verticalLineToRelative(-160f)
                lineToRelative(160f, -40f)
                lineToRelative(-160f, -40f)
                verticalLineToRelative(-160f)
                lineToRelative(400f, 200f)
                lineTo(520f, 880f)
                close()
                moveToRelative(-320f, -40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-152f)
                quadToRelative(48f, 0f, 84f, -30.5f)
                reflectiveQuadToRelative(36f, -77.5f)
                quadToRelative(0f, -47f, -36f, -77.5f)
                reflectiveQuadTo(120f, 392f)
                verticalLineToRelative(-152f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(290f)
                lineToRelative(-80f, -40f)
                verticalLineToRelative(-250f)
                horizontalLineTo(480f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(88f)
                quadToRelative(54f, 20f, 87f, 67f)
                reflectiveQuadToRelative(33f, 105f)
                quadToRelative(0f, 57f, -33f, 104f)
                reflectiveQuadToRelative(-87f, 68f)
                verticalLineToRelative(88f)
                horizontalLineToRelative(85f)
                quadToRelative(17f, -45f, 58f, -78.5f)
                reflectiveQuadToRelative(97f, -39.5f)
                verticalLineToRelative(80f)
                quadToRelative(-40f, 8f, -64f, 37.5f)
                reflectiveQuadTo(352f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(260f, -390f)
                close()
            }
        }.build()
        
        return _Send_time_extension!!
    }

private var _Send_time_extension: ImageVector? = null

