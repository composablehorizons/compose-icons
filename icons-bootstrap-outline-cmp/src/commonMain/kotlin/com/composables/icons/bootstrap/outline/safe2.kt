package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Safe2: ImageVector
    get() {
        if (_Safe2 != null) return _Safe2!!
        
        _Safe2 = ImageVector.Builder(
            name = "safe2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 1f)
                horizontalLineToRelative(12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 2.5f)
                verticalLineToRelative(12f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 14.5f)
                verticalLineTo(14f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                verticalLineTo(4f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                close()
                moveTo(2.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.035f, 8f)
                horizontalLineToRelative(1.528f)
                quadToRelative(0.072f, -0.277f, 0.214f, -0.516f)
                lineToRelative(-1.08f, -1.08f)
                arcTo(3.5f, 3.5f, 0f, false, false, 5.035f, 8f)
                moveToRelative(1.369f, -2.303f)
                lineToRelative(1.08f, 1.08f)
                quadToRelative(0.24f, -0.142f, 0.516f, -0.214f)
                verticalLineTo(5.035f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -1.596f, 0.662f)
                moveTo(9f, 5.035f)
                verticalLineToRelative(1.528f)
                quadToRelative(0.277f, 0.072f, 0.516f, 0.214f)
                lineToRelative(1.08f, -1.08f)
                arcTo(3.5f, 3.5f, 0f, false, false, 9f, 5.035f)
                moveToRelative(2.303f, 1.369f)
                lineToRelative(-1.08f, 1.08f)
                quadToRelative(0.142f, 0.24f, 0.214f, 0.516f)
                horizontalLineToRelative(1.528f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.662f, -1.596f)
                moveTo(11.965f, 9f)
                horizontalLineToRelative(-1.528f)
                quadToRelative(-0.072f, 0.277f, -0.214f, 0.516f)
                lineToRelative(1.08f, 1.08f)
                arcTo(3.5f, 3.5f, 0f, false, false, 11.965f, 9f)
                moveToRelative(-1.369f, 2.303f)
                lineToRelative(-1.08f, -1.08f)
                quadToRelative(-0.24f, 0.142f, -0.516f, 0.214f)
                verticalLineToRelative(1.528f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 1.596f, -0.662f)
                moveTo(8f, 11.965f)
                verticalLineToRelative(-1.528f)
                arcToRelative(2f, 2f, 0f, false, true, -0.516f, -0.214f)
                lineToRelative(-1.08f, 1.08f)
                arcTo(3.5f, 3.5f, 0f, false, false, 8f, 11.965f)
                moveToRelative(-2.303f, -1.369f)
                lineToRelative(1.08f, -1.08f)
                arcTo(2f, 2f, 0f, false, true, 6.563f, 9f)
                horizontalLineTo(5.035f)
                curveToRelative(0.085f, 0.593f, 0.319f, 1.138f, 0.662f, 1.596f)
                moveTo(4f, 8.5f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 9f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -9f, 0f)
                moveToRelative(4.5f, -1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _Safe2!!
    }

private var _Safe2: ImageVector? = null

