package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Privacy: ImageVector
    get() {
        if (_Privacy != null) return _Privacy!!
        
        _Privacy = ImageVector.Builder(
            name = "privacy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(394f, 281f)
                quadToRelative(2f, 0f, 3f, -0.5f)
                reflectiveQuadToRelative(3f, -0.5f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 360f)
                verticalLineToRelative(7f)
                lineToRelative(-86f, -86f)
                close()
                moveToRelative(452f, 385f)
                lineTo(720f, 540f)
                verticalLineToRelative(67f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-287f)
                horizontalLineTo(353f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(367f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                verticalLineToRelative(180f)
                lineToRelative(126f, -126f)
                quadToRelative(10f, -10f, 22f, -5f)
                reflectiveQuadToRelative(12f, 19f)
                verticalLineToRelative(344f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                close()
                moveTo(640f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(212f)
                verticalLineToRelative(-42f)
                quadToRelative(-69f, -10f, -116f, -58.5f)
                reflectiveQuadTo(201f, 504f)
                quadToRelative(-2f, -11f, 7f, -17.5f)
                reflectiveQuadToRelative(20f, -6.5f)
                quadToRelative(11f, 0f, 20f, 6f)
                reflectiveQuadToRelative(11f, 17f)
                quadToRelative(8f, 51f, 47.5f, 85.5f)
                reflectiveQuadTo(400f, 623f)
                quadToRelative(33f, 0f, 62.5f, -14.5f)
                reflectiveQuadTo(512f, 568f)
                lineToRelative(41f, 41f)
                quadToRelative(-24f, 29f, -56f, 46.5f)
                reflectiveQuadTo(428f, 678f)
                verticalLineToRelative(42f)
                horizontalLineToRelative(212f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, 80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 800f)
                close()
                moveTo(794f, 906f)
                lineTo(437f, 549f)
                quadToRelative(-9f, 5f, -18f, 8f)
                reflectiveQuadToRelative(-19f, 3f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 480f)
                verticalLineToRelative(-48f)
                lineTo(54f, 166f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(740f, 740f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(384f, 496f)
                close()
                moveToRelative(113f, -113f)
                close()
                moveTo(372f, 720f)
                horizontalLineToRelative(56f)
                horizontalLineToRelative(-56f)
                close()
            }
        }.build()
        
        return _Privacy!!
    }

private var _Privacy: ImageVector? = null

