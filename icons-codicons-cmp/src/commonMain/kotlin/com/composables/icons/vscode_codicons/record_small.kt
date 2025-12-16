package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RecordSmall: ImageVector
    get() {
        if (_RecordSmall != null) return _RecordSmall!!
        
        _RecordSmall = ImageVector.Builder(
            name = "record-small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 8.99988f)
                curveTo(8.55228f, 8.99988f, 9f, 8.55216f, 9f, 7.99988f)
                curveTo(9f, 7.44759f, 8.55228f, 6.99988f, 8f, 6.99988f)
                curveTo(7.44772f, 6.99988f, 7f, 7.44759f, 7f, 7.99988f)
                curveTo(7f, 8.55216f, 7.44772f, 8.99988f, 8f, 8.99988f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 7.99988f)
                curveTo(12f, 10.209f, 10.2091f, 11.9999f, 8f, 11.9999f)
                curveTo(5.79086f, 11.9999f, 4f, 10.209f, 4f, 7.99988f)
                curveTo(4f, 5.79074f, 5.79086f, 3.99988f, 8f, 3.99988f)
                curveTo(10.2091f, 3.99988f, 12f, 5.79074f, 12f, 7.99988f)
                close()
                moveTo(11f, 7.99988f)
                curveTo(11f, 6.34302f, 9.65685f, 4.99988f, 8f, 4.99988f)
                curveTo(6.34315f, 4.99988f, 5f, 6.34302f, 5f, 7.99988f)
                curveTo(5f, 9.65673f, 6.34315f, 10.9999f, 8f, 10.9999f)
                curveTo(9.65685f, 10.9999f, 11f, 9.65673f, 11f, 7.99988f)
                close()
            }
        }.build()
        
        return _RecordSmall!!
    }

private var _RecordSmall: ImageVector? = null

