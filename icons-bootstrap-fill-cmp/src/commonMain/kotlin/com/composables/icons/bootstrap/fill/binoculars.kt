package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Binoculars: ImageVector
    get() {
        if (_Binoculars != null) return _Binoculars!!
        
        _Binoculars = ImageVector.Builder(
            name = "binoculars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 2.5f)
                verticalLineTo(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5.5f, 1f)
                close()
                moveTo(7f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(0.882f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.276f, 0.447f)
                lineToRelative(0.895f, 0.447f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 7.118f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, -0.354f)
                lineToRelative(0.854f, -0.853f)
                verticalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(0.793f)
                lineToRelative(0.854f, 0.853f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(1f)
                verticalLineTo(7.118f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.83f, -1.342f)
                lineToRelative(0.894f, -0.447f)
                arcTo(0.5f, 0.5f, 0f, false, false, 3f, 4.882f)
                verticalLineTo(4f)
                close()
                moveTo(1f, 14f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 16f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 7f, 14.5f)
                verticalLineTo(14f)
                close()
                moveToRelative(8f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(14f)
                close()
                moveToRelative(4f, -11f)
                horizontalLineTo(9f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 1f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 2.5f)
                close()
            }
        }.build()
        
        return _Binoculars!!
    }

private var _Binoculars: ImageVector? = null

