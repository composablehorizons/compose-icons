package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_rotate: ImageVector
    get() {
        if (_Mobile_rotate != null) return _Mobile_rotate!!
        
        _Mobile_rotate = ImageVector.Builder(
            name = "mobile_rotate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 960f)
                quadToRelative(-99f, 0f, -186.5f, -37.5f)
                reflectiveQuadToRelative(-153f, -103f)
                quadTo(75f, 754f, 37.5f, 666.5f)
                reflectiveQuadTo(0f, 480f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 71f, 24f, 136f)
                reflectiveQuadToRelative(66.5f, 117f)
                quadTo(213f, 785f, 272f, 821.5f)
                reflectiveQuadTo(401f, 873f)
                lineTo(296f, 768f)
                lineToRelative(56f, -56f)
                lineTo(588f, 948f)
                quadToRelative(-26f, 6f, -53.5f, 9f)
                reflectiveQuadTo(480f, 960f)
                close()
                moveToRelative(400f, -480f)
                quadToRelative(0f, -71f, -24f, -136f)
                reflectiveQuadToRelative(-66.5f, -117f)
                quadTo(747f, 175f, 688f, 138.5f)
                reflectiveQuadTo(559f, 87f)
                lineToRelative(105f, 105f)
                lineToRelative(-56f, 56f)
                lineToRelative(-236f, -236f)
                quadToRelative(26f, -6f, 53.5f, -9f)
                reflectiveQuadToRelative(54.5f, -3f)
                quadToRelative(99f, 0f, 186.5f, 37.5f)
                reflectiveQuadToRelative(153f, 103f)
                quadToRelative(65.5f, 65.5f, 103f, 153f)
                reflectiveQuadTo(960f, 480f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(496f, 778f)
                lineTo(182.03f, 464f)
                quadTo(171f, 453f, 165.5f, 439f)
                quadToRelative(-5.5f, -14f, -5.5f, -29f)
                reflectiveQuadToRelative(5.74f, -29f)
                quadToRelative(5.74f, -14f, 16.26f, -25f)
                lineToRelative(173.62f, -174f)
                quadToRelative(11.03f, -11f, 25.08f, -16.5f)
                quadToRelative(14.05f, -5.5f, 29.11f, -5.5f)
                quadToRelative(15.05f, 0f, 29.1f, 5.5f)
                reflectiveQuadTo(464f, 182f)
                lineToRelative(313.97f, 313.97f)
                quadTo(789f, 507f, 794.5f, 521f)
                quadToRelative(5.5f, 14f, 5.5f, 29f)
                reflectiveQuadToRelative(-5.74f, 29f)
                quadToRelative(-5.74f, 14f, -16.26f, 25f)
                lineTo(604.38f, 778f)
                quadToRelative(-11.03f, 11f, -25.08f, 16.5f)
                quadToRelative(-14.05f, 5.5f, -29.11f, 5.5f)
                quadToRelative(-15.05f, 0f, -29.1f, -5.5f)
                reflectiveQuadTo(496f, 778f)
                close()
                moveTo(373f, 404f)
                quadToRelative(13f, 0f, 21.5f, -9f)
                reflectiveQuadToRelative(8.5f, -21f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(373f, 344f)
                quadToRelative(-12f, 0f, -21f, 8.5f)
                reflectiveQuadToRelative(-9f, 21.5f)
                quadToRelative(0f, 12f, 9f, 21f)
                reflectiveQuadToRelative(21f, 9f)
                close()
            }
        }.build()
        
        return _Mobile_rotate!!
    }

private var _Mobile_rotate: ImageVector? = null

