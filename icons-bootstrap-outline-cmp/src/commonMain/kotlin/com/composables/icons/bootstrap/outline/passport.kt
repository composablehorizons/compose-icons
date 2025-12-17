package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Passport: ImageVector
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
                moveTo(8f, 5f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
                moveTo(6f, 8f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                moveToRelative(-0.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.232f, 1.776f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 3.252f)
                verticalLineToRelative(10.95f)
                curveToRelative(0f, 0.445f, 0.191f, 0.838f, 0.49f, 1.11f)
                curveToRelative(0.367f, 0.422f, 0.908f, 0.688f, 1.51f, 0.688f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -1f, -1.732f)
                verticalLineToRelative(-0.47f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.232f, 0.321f)
                lineToRelative(-8f, 1.454f)
                close()
                moveTo(4f, 3f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _Passport!!
    }

private var _Passport: ImageVector? = null

