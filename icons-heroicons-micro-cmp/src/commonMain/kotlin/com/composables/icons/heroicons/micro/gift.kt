package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Gift: ImageVector
    get() {
        if (_Gift != null) return _Gift!!
        
        _Gift = ImageVector.Builder(
            name = "gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 3.505f)
                curveToRelative(0f, 0.562f, 0.186f, 1.082f, 0.5f, 1.5f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(5.25f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                horizontalLineToRelative(-2.25f)
                arcTo(2.5f, 2.5f, 0f, false, false, 8f, 1.719f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -4.25f, 1.786f)
                close()
                moveToRelative(3.499f, 0f)
                verticalLineToRelative(-0.038f)
                arcToRelative(1f, 1f, 0f, true, false, -0.999f, 1.038f)
                horizontalLineToRelative(1f)
                lineToRelative(-0.001f, -1f)
                close()
                moveToRelative(2.5f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 0.962f)
                lineToRelative(0.001f, 0.038f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(0.999f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25f, 8.505f)
                horizontalLineTo(2f)
                verticalLineToRelative(3.5f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(8.75f, 14.005f)
                verticalLineToRelative(-5.5f)
                horizontalLineTo(14f)
                verticalLineToRelative(3.5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(8.75f)
                close()
            }
        }.build()
        
        return _Gift!!
    }

private var _Gift: ImageVector? = null

