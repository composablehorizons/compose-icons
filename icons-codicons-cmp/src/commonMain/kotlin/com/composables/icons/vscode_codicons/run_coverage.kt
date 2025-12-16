package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RunCoverage: ImageVector
    get() {
        if (_RunCoverage != null) return _RunCoverage!!
        
        _RunCoverage = ImageVector.Builder(
            name = "run-coverage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 7f)
                curveTo(6.985f, 7f, 9f, 9.015f, 9f, 11.5f)
                curveTo(9f, 13.985f, 6.985f, 16f, 4.5f, 16f)
                curveTo(2.015f, 16f, 0f, 13.985f, 0f, 11.5f)
                curveTo(0f, 9.015f, 2.015f, 7f, 4.5f, 7f)
                close()
                moveTo(6.85352f, 10.1465f)
                curveTo(6.65826f, 9.95123f, 6.34175f, 9.95124f, 6.14648f, 10.1465f)
                lineTo(4f, 12.293f)
                lineTo(2.85352f, 11.1465f)
                curveTo(2.65826f, 10.9512f, 2.34175f, 10.9512f, 2.14648f, 11.1465f)
                curveTo(1.95122f, 11.3417f, 1.95122f, 11.6583f, 2.14648f, 11.8535f)
                lineTo(3.64648f, 13.3535f)
                curveTo(3.84175f, 13.5488f, 4.15826f, 13.5488f, 4.35352f, 13.3535f)
                lineTo(6.85352f, 10.8535f)
                curveTo(7.04875f, 10.6583f, 7.04875f, 10.3417f, 6.85352f, 10.1465f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                curveTo(4.756f, 2f, 5.0104f, 2.06641f, 5.2334f, 2.19141f)
                lineTo(13.2334f, 6.69141f)
                curveTo(13.7061f, 6.95747f, 14f, 7.45818f, 14f, 8f)
                curveTo(14f, 8.54182f, 13.7061f, 9.04253f, 13.2334f, 9.30859f)
                lineTo(9.98145f, 11.1377f)
                curveTo(9.95743f, 10.7768f, 9.89857f, 10.4268f, 9.80859f, 10.0879f)
                lineTo(12.7441f, 8.43652f)
                curveTo(12.902f, 8.34748f, 13f, 8.18088f, 13f, 8f)
                curveTo(13f, 7.81911f, 12.902f, 7.65249f, 12.7451f, 7.56445f)
                lineTo(4.74414f, 3.06348f)
                curveTo(4.66914f, 3.02148f, 4.587f, 3f, 4.5f, 3f)
                curveTo(4.225f, 3f, 4f, 3.225f, 4f, 3.5f)
                verticalLineTo(6.02539f)
                curveTo(3.65602f, 6.05639f, 3.32298f, 6.1209f, 3f, 6.21289f)
                verticalLineTo(3.5f)
                curveTo(3f, 2.673f, 3.673f, 2f, 4.5f, 2f)
                close()
            }
        }.build()
        
        return _RunCoverage!!
    }

private var _RunCoverage: ImageVector? = null

