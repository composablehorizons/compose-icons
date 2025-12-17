package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Scooter: ImageVector
    get() {
        if (_Scooter != null) return _Scooter!!
        
        _Scooter = ImageVector.Builder(
            name = "scooter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-0.39f)
                lineToRelative(1.4f, 7f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -0.98f, 0.195f)
                lineToRelative(-0.189f, -0.938f)
                lineToRelative(-2.43f, 3.527f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9.5f, 13f)
                horizontalLineTo(4.95f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0f, -1f)
                horizontalLineToRelative(4.287f)
                lineToRelative(2.831f, -4.11f)
                lineTo(11.09f, 3f)
                horizontalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(3.915f, 12f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 1f)
                horizontalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                close()
                moveToRelative(8.817f, -0.789f)
                arcTo(1.499f, 1.499f, 0f, false, false, 13.5f, 14f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.213f, -2.985f)
                lineToRelative(0.277f, 1.387f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.98f, 0.196f)
                close()
            }
        }.build()
        
        return _Scooter!!
    }

private var _Scooter: ImageVector? = null

