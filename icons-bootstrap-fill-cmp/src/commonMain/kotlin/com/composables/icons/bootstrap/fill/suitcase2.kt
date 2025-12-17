package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Suitcase2: ImageVector
    get() {
        if (_Suitcase2 != null) return _Suitcase2!!
        
        _Suitcase2 = ImageVector.Builder(
            name = "suitcase2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(3f)
                horizontalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 4.5f)
                verticalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.003f, 1.416f)
                arcTo(1f, 1f, 0f, true, false, 6f, 15f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, true, false, 1.996f, -0.084f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13f, 13.5f)
                verticalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.5f, 3f)
                horizontalLineTo(10f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(9f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(4f, 7f)
                verticalLineTo(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Suitcase2!!
    }

private var _Suitcase2: ImageVector? = null

