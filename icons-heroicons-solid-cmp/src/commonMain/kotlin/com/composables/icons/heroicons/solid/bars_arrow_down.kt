package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.BarsArrowDown: ImageVector
    get() {
        if (_BarsArrowDown != null) return _BarsArrowDown!!
        
        _BarsArrowDown = ImageVector.Builder(
            name = "bars-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.25f, 4.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 3.75f)
                horizontalLineToRelative(14.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveToRelative(0f, 4.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 8.25f)
                horizontalLineToRelative(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2.25f, 9f)
                close()
                moveToRelative(15f, -0.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 18f, 9f)
                verticalLineToRelative(10.19f)
                lineToRelative(2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-3.75f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.47f, 2.47f)
                verticalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(-15f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _BarsArrowDown!!
    }

private var _BarsArrowDown: ImageVector? = null

