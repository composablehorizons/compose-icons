package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Passport: ImageVector
    get() {
        if (_Passport != null) return _Passport!!
        
        _Passport = ImageVector.Builder(
            name = "passport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 6f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3.252f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.232f, -1.476f)
                lineToRelative(8f, -1.454f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 1.797f)
                verticalLineToRelative(0.47f)
                arcTo(2f, 2f, 0f, false, true, 14f, 4f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -1.51f, -0.688f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.49f, -1.11f)
                verticalLineTo(3.253f)
                close()
                moveTo(5f, 8f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -6f, 0f)
                moveToRelative(0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
            }
        }.build()
        
        return _Passport!!
    }

private var _Passport: ImageVector? = null

