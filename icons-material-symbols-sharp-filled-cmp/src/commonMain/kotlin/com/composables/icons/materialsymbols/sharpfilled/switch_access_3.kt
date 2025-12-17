package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Switch_access_3: ImageVector
    get() {
        if (_Switch_access_3 != null) return _Switch_access_3!!
        
        _Switch_access_3 = ImageVector.Builder(
            name = "switch_access_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 640f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(80f, 360f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveTo(400f, 880f)
                verticalLineToRelative(-127f)
                lineToRelative(273f, -273f)
                lineToRelative(-273f, -273f)
                verticalLineToRelative(-127f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(205f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(190f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(405f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Switch_access_3!!
    }

private var _Switch_access_3: ImageVector? = null

