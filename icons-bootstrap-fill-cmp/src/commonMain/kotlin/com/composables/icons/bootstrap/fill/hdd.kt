package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Hdd: ImageVector
    get() {
        if (_Hdd != null) return _Hdd!!
        
        _Hdd = ImageVector.Builder(
            name = "hdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(2.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                moveTo(0.91f, 7.204f)
                arcTo(3f, 3f, 0f, false, true, 2f, 7f)
                horizontalLineToRelative(12f)
                curveToRelative(0.384f, 0f, 0.752f, 0.072f, 1.09f, 0.204f)
                lineToRelative(-1.867f, -3.422f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.906f, 3f)
                horizontalLineTo(4.094f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.317f, 0.782f)
                close()
            }
        }.build()
        
        return _Hdd!!
    }

private var _Hdd: ImageVector? = null

