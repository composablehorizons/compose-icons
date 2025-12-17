package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Hospital: ImageVector
    get() {
        if (_Hospital != null) return _Hospital!!
        
        _Hospital = ImageVector.Builder(
            name = "hospital",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 5.034f)
                verticalLineToRelative(1.1f)
                lineToRelative(0.953f, -0.55f)
                lineToRelative(0.5f, 0.867f)
                lineTo(9f, 7f)
                lineToRelative(0.953f, 0.55f)
                lineToRelative(-0.5f, 0.866f)
                lineToRelative(-0.953f, -0.55f)
                verticalLineToRelative(1.1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.1f)
                lineToRelative(-0.953f, 0.55f)
                lineToRelative(-0.5f, -0.866f)
                lineTo(7f, 7f)
                lineToRelative(-0.953f, -0.55f)
                lineToRelative(0.5f, -0.866f)
                lineToRelative(0.953f, 0.55f)
                verticalLineToRelative(-1.1f)
                close()
                moveTo(13.25f, 9f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(13f, 11.25f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                close()
                moveToRelative(0.25f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                close()
                moveToRelative(-11f, -4f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.5f)
                arcTo(0.25f, 0.25f, 0f, false, false, 3f, 9.75f)
                verticalLineToRelative(-0.5f)
                arcTo(0.25f, 0.25f, 0f, false, false, 2.75f, 9f)
                close()
                moveToRelative(0f, 2f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(2f, 13.25f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveToRelative(2f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineTo(7f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(1f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
                moveToRelative(0f, -14f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(2f, 7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineTo(8f)
                close()
                moveToRelative(-8f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineToRelative(7f)
                close()
            }
        }.build()
        
        return _Hospital!!
    }

private var _Hospital: ImageVector? = null

