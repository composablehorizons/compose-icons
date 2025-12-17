package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Real_estate_agent: ImageVector
    get() {
        if (_Real_estate_agent != null) return _Real_estate_agent!!
        
        _Real_estate_agent = ImageVector.Builder(
            name = "real_estate_agent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 900f)
                lineToRelative(-280f, -78f)
                verticalLineToRelative(58f)
                horizontalLineTo(40f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(318f)
                lineToRelative(322f, 120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                lineTo(560f, 900f)
                close()
                moveTo(120f, 800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(438f, 16f)
                lineToRelative(238f, -74f)
                verticalLineToRelative(-22f)
                horizontalLineTo(513f)
                lineToRelative(-125f, -42f)
                lineToRelative(24f, -76f)
                lineToRelative(117f, 38f)
                horizontalLineToRelative(71f)
                verticalLineToRelative(-26f)
                lineToRelative(-256f, -94f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(220f)
                lineToRelative(278f, 76f)
                close()
                moveToRelative(202f, -256f)
                verticalLineToRelative(-260f)
                lineTo(560f, 160f)
                lineTo(360f, 300f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-100f)
                lineToRelative(280f, -200f)
                lineToRelative(280f, 200f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(560f, 160f)
                close()
                moveToRelative(20f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(80f, 80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Real_estate_agent!!
    }

private var _Real_estate_agent: ImageVector? = null

